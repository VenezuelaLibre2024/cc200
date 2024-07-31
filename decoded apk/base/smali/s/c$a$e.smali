.class public Ls/c$a$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/c$a;->B1(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Landroid/net/Uri;

.field public final synthetic j:Z

.field public final synthetic k:Landroid/os/Bundle;

.field public final synthetic l:Ls/c$a;


# direct methods
.method public constructor <init>(Ls/c$a;ILandroid/net/Uri;ZLandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ls/c$a$e;->l:Ls/c$a;

    iput p2, p0, Ls/c$a$e;->h:I

    iput-object p3, p0, Ls/c$a$e;->i:Landroid/net/Uri;

    iput-boolean p4, p0, Ls/c$a$e;->j:Z

    iput-object p5, p0, Ls/c$a$e;->k:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Ls/c$a$e;->l:Ls/c$a;

    iget-object v0, v0, Ls/c$a;->b:Ls/b;

    iget v1, p0, Ls/c$a$e;->h:I

    iget-object v2, p0, Ls/c$a$e;->i:Landroid/net/Uri;

    iget-boolean v3, p0, Ls/c$a$e;->j:Z

    iget-object v4, p0, Ls/c$a$e;->k:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3, v4}, Ls/b;->onRelationshipValidationResult(ILandroid/net/Uri;ZLandroid/os/Bundle;)V

    return-void
.end method
