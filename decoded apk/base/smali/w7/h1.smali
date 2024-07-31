.class public final synthetic Lw7/h1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly7/g;


# instance fields
.field public synthetic a:Ly7/e0;

.field public synthetic b:Ly7/e0;

.field public synthetic c:Ly7/e0;

.field public synthetic d:Ly7/e0;

.field public synthetic e:Ly7/e0;


# direct methods
.method public synthetic constructor <init>(Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/h1;->a:Ly7/e0;

    iput-object p2, p0, Lw7/h1;->b:Ly7/e0;

    iput-object p3, p0, Lw7/h1;->c:Ly7/e0;

    iput-object p4, p0, Lw7/h1;->d:Ly7/e0;

    iput-object p5, p0, Lw7/h1;->e:Ly7/e0;

    return-void
.end method


# virtual methods
.method public final a(Ly7/d;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lw7/h1;->a:Ly7/e0;

    iget-object v1, p0, Lw7/h1;->b:Ly7/e0;

    iget-object v2, p0, Lw7/h1;->c:Ly7/e0;

    iget-object v3, p0, Lw7/h1;->d:Ly7/e0;

    iget-object v4, p0, Lw7/h1;->e:Ly7/e0;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/google/firebase/auth/FirebaseAuthRegistrar;->lambda$getComponents$0(Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;Ly7/e0;Ly7/d;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    return-object p1
.end method
