.class public Ls/c$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/c$a;->c1(ILandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Landroid/os/Bundle;

.field public final synthetic j:Ls/c$a;


# direct methods
.method public constructor <init>(Ls/c$a;ILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ls/c$a$a;->j:Ls/c$a;

    iput p2, p0, Ls/c$a$a;->h:I

    iput-object p3, p0, Ls/c$a$a;->i:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ls/c$a$a;->j:Ls/c$a;

    iget-object v0, v0, Ls/c$a;->b:Ls/b;

    iget v1, p0, Ls/c$a$a;->h:I

    iget-object v2, p0, Ls/c$a$a;->i:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Ls/b;->onNavigationEvent(ILandroid/os/Bundle;)V

    return-void
.end method
