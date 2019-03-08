#!/usr/bin/env bash
TAGS=${1:-""}
REPORT="reports/test/benchmarks-$(uname -s)_${TAGS}$(date +%Y%m%d%H%M%S).txt"
echo "Saving report: $REPORT"
java -jar test/dist/benchmarks.jar -f 1 -wi 1 -i 1 -o "$REPORT"
git add "$REPORT"
git ci -m "Add $REPORT"
