#!/bin/bash

for SUBDIR in ./*/; do
	if [ -d "$SUBDIR" ]; then
		touch "${SUBDIR}main.py"
		touch "${SUBDIR}Main.java"
		touch "${SUBDIR}main.cpp"
	fi
done
