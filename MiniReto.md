# MiniReto
**Contexto del reto**
Imaginemos que nuestro sistema de notificaciones ya funciona correctamente usando el principio de sustitución de Liskov.

**Actualmente tenemos tres tipos de notificación:**
- SmsNotificacion
- EmailNotificacion
- PushNotificacion
Cada una utiliza su propia política de envío a través de la interfaz PoliticaEnvio.

**Situación nueva**

La empresa ahora quiere agregar un nuevo canal de comunicación:
- Notificaciones por WhatsApp

Pero este canal tiene una regla especial:
- El mensaje no puede superar los 500 caracteres
- Debe incluir un número de teléfono válido

**Reto para los estudiantes**

Diseñar la integración de WhatsAppNotificacion dentro del sistema sin romper el principio de sustitución de Liskov.

Para esto deben responder:
- ¿Qué nueva política de envío deberían crear?
- ¿Cómo debería integrarse la nueva notificación dentro del sistema existente?
- ¿Se debería modificar alguna clase existente o solo agregar nuevas?
- ¿Cómo asegurar que WhatsAppNotificacion pueda sustituir a cualquier Notificacion sin romper el sistema?

**Implementar:**
- PoliticaWhatsApp
- WhatsAppNotificacion

Respetando la arquitectura existente.
