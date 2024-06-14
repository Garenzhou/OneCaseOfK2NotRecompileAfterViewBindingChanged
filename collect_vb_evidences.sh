#!/bin/bash

zip_file_name="vb_evidences.zip"

# shellcheck disable=SC2207
files=($(find . \( -name "ActivityMainBinding.*" -o -name "MainActivity.*" \)))

if [ ${#files[@]} -eq 0 ]; then
    echo "no target file be found!"
    exit 1
fi

echo "packing target files into '$zip_file_name' ..."
zip -r "$zip_file_name" "${files[@]}"

if [ $? -eq 0 ]; then
    echo "packing done. check the '$zip_file_name' file!"
else
    echo "packing failed!"
fi
