.class public final synthetic Ld0/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ld0/b$d;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:I

.field public final synthetic k:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Ld0/b$d;Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/g;->h:Ld0/b$d;

    iput-object p2, p0, Ld0/g;->i:Ljava/lang/String;

    iput p3, p0, Ld0/g;->j:I

    iput-object p4, p0, Ld0/g;->k:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ld0/g;->h:Ld0/b$d;

    iget-object v1, p0, Ld0/g;->i:Ljava/lang/String;

    iget v2, p0, Ld0/g;->j:I

    iget-object v3, p0, Ld0/g;->k:Landroid/os/Bundle;

    invoke-static {v0, v1, v2, v3}, Ld0/b$d;->b(Ld0/b$d;Ljava/lang/String;ILandroid/os/Bundle;)V

    return-void
.end method
