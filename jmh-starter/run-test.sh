#!/usr/bin/env bash
TAGS=${1:-"$(uname -s)"}
REPORT="target/${TAGS}_benchmarks-$(date +%Y%m%d%H%M%S).txt"
echo "Saving report: $REPORT"
java -jar target/benchmarks.jar -f 1 -wi 1 -i 1 -o "$REPORT" 'zemian.jmhstarter.*'
