.class public Lw7/n0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/google/firebase/auth/FirebaseAuth;

.field public final b:Landroid/os/Bundle;

.field public final c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lw7/n0$a;->b:Landroid/os/Bundle;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iput-object v1, p0, Lw7/n0$a;->c:Landroid/os/Bundle;

    iput-object p2, p0, Lw7/n0$a;->a:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {p2}, Lcom/google/firebase/auth/FirebaseAuth;->i()Ln7/g;

    move-result-object v2

    invoke-virtual {v2}, Ln7/g;->r()Ln7/p;

    move-result-object v2

    invoke-virtual {v2}, Ln7/p;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.google.firebase.auth.KEY_API_KEY"

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "com.google.firebase.auth.KEY_PROVIDER_ID"

    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/zzact;->zza()Lcom/google/android/gms/internal/firebase-auth-api/zzact;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzact;->zzb()Ljava/lang/String;

    move-result-object p1

    const-string v1, "com.google.firebase.auth.internal.CLIENT_VERSION"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/firebase/auth/FirebaseAuth;->n()Ljava/lang/String;

    move-result-object p1

    const-string v1, "com.google.firebase.auth.KEY_TENANT_ID"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/firebase/auth/FirebaseAuth;->i()Ln7/g;

    move-result-object p1

    invoke-virtual {p1}, Ln7/g;->q()Ljava/lang/String;

    move-result-object p1

    const-string v1, "com.google.firebase.auth.KEY_FIREBASE_APP_NAME"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/firebase/auth/FirebaseAuth;->k()Ljava/lang/String;

    move-result-object p1

    const-string p2, "com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN"

    invoke-virtual {v0, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/google/firebase/auth/FirebaseAuth;Lw7/n1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw7/n0$a;-><init>(Ljava/lang/String;Lcom/google/firebase/auth/FirebaseAuth;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)Lw7/n0$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lw7/n0$a;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Lw7/n0$a;->c:Landroid/os/Bundle;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public b()Lw7/n0;
    .locals 3

    new-instance v0, Lw7/n0;

    iget-object v1, p0, Lw7/n0$a;->b:Landroid/os/Bundle;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw7/n0;-><init>(Landroid/os/Bundle;Lw7/p1;)V

    return-object v0
.end method

.method public c(Ljava/util/List;)Lw7/n0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lw7/n0$a;"
        }
    .end annotation

    iget-object v0, p0, Lw7/n0$a;->b:Landroid/os/Bundle;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p1, "com.google.firebase.auth.KEY_PROVIDER_SCOPES"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object p0
.end method
