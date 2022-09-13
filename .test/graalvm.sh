set -e

# Ensure GRAALVM_HOME environment variable is set, otherwise fail fast.
if [ -z "${GRAALVM_HOME+x}" ]; then
  echo -n "The environment variable GRAALVM_HOME is not set. GraalVM native-image must be available for this test to execute."
  exit 1
else
  # Run Unit and Integration Tests with Native Image
  mvn -B ${INTEGRATION_TEST_ARGS} -ntp -Pnative -Penable-integration-tests test
fi
