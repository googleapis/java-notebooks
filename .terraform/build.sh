set -e

# Perform gcloud auth login if no current credentials are available.
if gcloud auth print-access-token &>/dev/null; then
  true
else
  gcloud auth login
fi

# Ensure GOOGLE_CLOUD_PROJECT environment variable is set.
if [ -z "${GOOGLE_CLOUD_PROJECT+x}" ]; then
  echo -n "The Google Cloud Project to deploy resources to:"
  read -r project_id
  export GOOGLE_CLOUD_PROJECT="${project_id}"
fi

## Get the directory of the build script
scriptDir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")

cd "${scriptDir}"
terraform init
terraform plan -var="project_id=${GOOGLE_CLOUD_PROJECT}"
terraform apply -var="project_id=${GOOGLE_CLOUD_PROJECT}" -auto-approve
terraform destroy -var="project_id=${GOOGLE_CLOUD_PROJECT}" -auto-approve
