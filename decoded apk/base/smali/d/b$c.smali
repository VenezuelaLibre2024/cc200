.class public Ld/b$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final h:I

.field public final i:Landroid/os/Bundle;

.field public final synthetic j:Ld/b;


# direct methods
.method public constructor <init>(Ld/b;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Ld/b$c;->j:Ld/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Ld/b$c;->h:I

    iput-object p3, p0, Ld/b$c;->i:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ld/b$c;->j:Ld/b;

    iget v1, p0, Ld/b$c;->h:I

    iget-object v2, p0, Ld/b$c;->i:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Ld/b;->a(ILandroid/os/Bundle;)V

    return-void
.end method
