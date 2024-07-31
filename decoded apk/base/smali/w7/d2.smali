.class public final synthetic Lw7/d2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lcom/google/firebase/auth/b$b;

.field public synthetic i:Ln7/m;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/auth/b$b;Ln7/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/d2;->h:Lcom/google/firebase/auth/b$b;

    iput-object p2, p0, Lw7/d2;->i:Ln7/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw7/d2;->h:Lcom/google/firebase/auth/b$b;

    iget-object v1, p0, Lw7/d2;->i:Ln7/m;

    invoke-virtual {v0, v1}, Lcom/google/firebase/auth/b$b;->onVerificationFailed(Ln7/m;)V

    return-void
.end method
