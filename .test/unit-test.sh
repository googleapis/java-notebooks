set -e

mvn test -B -ntp -Dclirr.skip=true -Denforcer.skip=true
