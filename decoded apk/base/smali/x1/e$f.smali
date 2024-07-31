.class public Lx1/e$f;
.super Lx1/m$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/e;->o(Ljava/lang/Object;Landroid/graphics/Rect;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/graphics/Rect;

.field public final synthetic b:Lx1/e;


# direct methods
.method public constructor <init>(Lx1/e;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lx1/e$f;->b:Lx1/e;

    iput-object p2, p0, Lx1/e$f;->a:Landroid/graphics/Rect;

    invoke-direct {p0}, Lx1/m$e;-><init>()V

    return-void
.end method
