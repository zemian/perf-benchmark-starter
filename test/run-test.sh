#!/usr/bin/env bash
TAGS=${1:-"$(uname -s)"}
REPORT="target/benchmarks-${TAGS}_$(date +%Y%m%d%H%M%S).txt"
echo "Saving report: $REPORT"
java -jar target/benchmarks.jar -f 1 -wi 1 -i 1 -o "$REPORT"
git add "$REPORT"
git ci -m "Add $REPORT"
