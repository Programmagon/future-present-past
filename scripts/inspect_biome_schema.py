import json
from pathlib import Path
p = Path(r'C:\Users\vitus\.gradle\caches\neoformruntime\assets\indexes\17.json')
if not p.exists():
    raise FileNotFoundError(p)
data = json.loads(p.read_text(encoding='utf-8'))
keys = [k for k in data['objects'] if 'worldgen/biome' in k]
print('count', len(keys))
for k in keys[:20]:
    print(k)
if keys:
    h = data['objects'][keys[0]]['hash']
    obj = Path(r'C:\Users\vitus\.gradle\caches\neoformruntime\assets\objects') / h[:2] / h[2:]
    print('sample path', obj)
    print(obj.read_text('utf-8')[:1200])
