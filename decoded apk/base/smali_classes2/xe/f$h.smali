.class public Lxe/f$h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public a:Ljava/net/Socket;

.field public b:Ljava/lang/String;

.field public c:Lbf/e;

.field public d:Lbf/d;

.field public e:Lxe/f$j;

.field public f:Lxe/l;

.field public g:Z

.field public h:I


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lxe/f$j;->a:Lxe/f$j;

    iput-object v0, p0, Lxe/f$h;->e:Lxe/f$j;

    sget-object v0, Lxe/l;->a:Lxe/l;

    iput-object v0, p0, Lxe/f$h;->f:Lxe/l;

    iput-boolean p1, p0, Lxe/f$h;->g:Z

    return-void
.end method


# virtual methods
.method public a()Lxe/f;
    .locals 1

    new-instance v0, Lxe/f;

    invoke-direct {v0, p0}, Lxe/f;-><init>(Lxe/f$h;)V

    return-object v0
.end method

.method public b(Lxe/f$j;)Lxe/f$h;
    .locals 0

    iput-object p1, p0, Lxe/f$h;->e:Lxe/f$j;

    return-object p0
.end method

.method public c(I)Lxe/f$h;
    .locals 0

    iput p1, p0, Lxe/f$h;->h:I

    return-object p0
.end method

.method public d(Ljava/net/Socket;Ljava/lang/String;Lbf/e;Lbf/d;)Lxe/f$h;
    .locals 0

    iput-object p1, p0, Lxe/f$h;->a:Ljava/net/Socket;

    iput-object p2, p0, Lxe/f$h;->b:Ljava/lang/String;

    iput-object p3, p0, Lxe/f$h;->c:Lbf/e;

    iput-object p4, p0, Lxe/f$h;->d:Lbf/d;

    return-object p0
.end method
