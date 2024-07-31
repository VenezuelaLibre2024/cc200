.class public Ls/c$a$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/c$a;->D0(IILandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Landroid/os/Bundle;

.field public final synthetic k:Ls/c$a;


# direct methods
.method public constructor <init>(Ls/c$a;IILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ls/c$a$f;->k:Ls/c$a;

    iput p2, p0, Ls/c$a$f;->h:I

    iput p3, p0, Ls/c$a$f;->i:I

    iput-object p4, p0, Ls/c$a$f;->j:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Ls/c$a$f;->k:Ls/c$a;

    iget-object v0, v0, Ls/c$a;->b:Ls/b;

    iget v1, p0, Ls/c$a$f;->h:I

    iget v2, p0, Ls/c$a$f;->i:I

    iget-object v3, p0, Ls/c$a$f;->j:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Ls/b;->onActivityResized(IILandroid/os/Bundle;)V

    return-void
.end method
