# HashiCorp Vault Setup with Docker

Este README fornece instruções para configurar o HashiCorp Vault usando Docker. Siga os passos abaixo para baixar a imagem do Vault, executar um contêiner do Vault e acessar a interface do usuário do Vault.

## Pré-requisitos

- Certifique-se de que você tem o Docker instalado em sua máquina. Se não tiver o Docker, você pode baixá-lo no [site oficial do Docker](https://www.docker.com/get-started).

## Passos para Configurar o Vault

### 1. Baixar a Imagem do Docker do Vault

Primeiro, você precisa baixar a imagem do Vault do Docker Hub. Você pode fazer isso executando o seguinte comando:

```bash
sudo docker pull hashicorp/vault:1.13.3
