# Valkey

https://valkey.io/

イメージのbuild
```zsh
docker image build -t valkey .
```
作成されたイメージの確認
```zsh
docker images | grep valkey
```
イメージを元にコンテナを起動
```zsh
docker run --rm --name valkey -d valkey
```
valkeyへ接続
```zsh
docker exec -it valkey valkey-cli
```

## 動作確認

```zsh
# https://valkey.io/commands/set/
SET key "Hello"
GET key
```