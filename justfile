become:
  # Adding `nixpkgs-unstable` channel for more up-to-date binaries, skip this if you already have `nixpkgs-unstable` in your channel list
  nix-channel --add https://nixos.org/channels/nixpkgs-unstable nixpkgs-unstable
  nix-channel --update
  nix-env -iA nixpkgs-unstable.babashka
  alias duck=bb
play: become
	duck thesubtleart.bb
