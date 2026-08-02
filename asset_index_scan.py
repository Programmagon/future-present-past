import json
from pathlib import Path
p = Path('C:/Users/vitus/.gradle/caches/neoformruntime/assets/indexes/17.json')
with p.open('r', encoding='utf-8') as f:
    data = json.load(f)
for k in data.get('objects', {}):
    if 'worldgen/biome' in k:
        print(k)
