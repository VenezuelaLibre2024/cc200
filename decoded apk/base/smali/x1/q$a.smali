.class public Lx1/q$a;
.super Lx1/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/q;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx1/m;

.field public final synthetic b:Lx1/q;


# direct methods
.method public constructor <init>(Lx1/q;Lx1/m;)V
    .locals 0

    iput-object p1, p0, Lx1/q$a;->b:Lx1/q;

    iput-object p2, p0, Lx1/q$a;->a:Lx1/m;

    invoke-direct {p0}, Lx1/n;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lx1/m;)V
    .locals 1

    iget-object v0, p0, Lx1/q$a;->a:Lx1/m;

    invoke-virtual {v0}, Lx1/m;->X()V

    invoke-virtual {p1, p0}, Lx1/m;->T(Lx1/m$f;)Lx1/m;

    return-void
.end method
