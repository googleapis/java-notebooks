set -e

mvn -B ${INTEGRATION_TEST_ARGS} \
  -ntp \
  -Penable-integration-tests \
  -DtrimStackTrace=false \
  -Dclirr.skip=true \
  -Denforcer.skip=true \
  -fae \
  verify
