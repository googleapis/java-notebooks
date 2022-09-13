pushd ./samples/snapshot || exit

mvn -B \
  -ntp \
  -DtrimStackTrace=false \
  -Dclirr.skip=true \
  -Denforcer.skip=true \
  -fae \
  verify

popd || exit
