.class public Lx1/e$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg0/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/e;->q(Landroidx/fragment/app/Fragment;Ljava/lang/Object;Lg0/e;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx1/m;

.field public final synthetic b:Lx1/e;


# direct methods
.method public constructor <init>(Lx1/e;Lx1/m;)V
    .locals 0

    iput-object p1, p0, Lx1/e$d;->b:Lx1/e;

    iput-object p2, p0, Lx1/e$d;->a:Lx1/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lx1/e$d;->a:Lx1/m;

    invoke-virtual {v0}, Lx1/m;->h()V

    return-void
.end method
