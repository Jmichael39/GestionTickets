# Verificación de Código Numérico

Reto propuesto en el evento organizado por el instituto Severo Ochoa en el Encuentro de Desarrollo de Aplicaciones 2025.
https://portal.edu.gva.es/03013224/encuentro-desarrollo-aplicaciones/

Este proyecto en Java implementa un sistema de verificación para cadenas numéricas según una regla específica basada en la posición de los dígitos.

## 🔢 Lógica del verificador

Para cada dígito de la cadena:

- Si el dígito está en una posición **impar** (índice par en Java, ya que comienza en 0):
  - Se multiplica por 3.
  - Se le suma el **menor dígito a su derecha**.

- Si el dígito está en una posición **par** (índice impar en Java):
  - Se multiplica por 2.
  - Se le suma el **mayor dígito a su izquierda**.

### 📘 Ejemplo

**Entrada:**
3 
7214 
10 
1001

**Salida esperada:**
55
4
8

#### Explicación para `7214`:
- `(7 * 3 + 1)` → menor a su derecha = 1  
- `(2 * 2 + 7)` → mayor a su izquierda = 7  
- `(1 * 3 + 4)` → menor a su derecha = 4  
- `(4 * 2 + 7)` → mayor a su izquierda = 7  
- Total: `21 + 11 + 7 + 15 = 55`

---
