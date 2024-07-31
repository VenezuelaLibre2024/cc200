.class public Ls/c$a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/c$a;->y1(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Landroid/os/Bundle;

.field public final synthetic i:Ls/c$a;


# direct methods
.method public constructor <init>(Ls/c$a;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ls/c$a$c;->i:Ls/c$a;

    iput-object p2, p0, Ls/c$a$c;->h:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ls/c$a$c;->i:Ls/c$a;

    iget-object v0, v0, Ls/c$a;->b:Ls/b;

    iget-object v1, p0, Ls/c$a$c;->h:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Ls/b;->onMessageChannelReady(Landroid/os/Bundle;)V

    return-void
.end method
