.class public Lx1/m$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Landroid/view/View;

.field public b:Ljava/lang/String;

.field public c:Lx1/s;

.field public d:Lx1/m0;

.field public e:Lx1/m;


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/String;Lx1/m;Lx1/m0;Lx1/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/m$d;->a:Landroid/view/View;

    iput-object p2, p0, Lx1/m$d;->b:Ljava/lang/String;

    iput-object p5, p0, Lx1/m$d;->c:Lx1/s;

    iput-object p4, p0, Lx1/m$d;->d:Lx1/m0;

    iput-object p3, p0, Lx1/m$d;->e:Lx1/m;

    return-void
.end method
