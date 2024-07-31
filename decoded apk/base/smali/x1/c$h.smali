.class public Lx1/c$h;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/c;->q(Landroid/view/ViewGroup;Lx1/s;Lx1/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx1/c$k;

.field public final synthetic b:Lx1/c;

.field private mViewBounds:Lx1/c$k;


# direct methods
.method public constructor <init>(Lx1/c;Lx1/c$k;)V
    .locals 0

    iput-object p1, p0, Lx1/c$h;->b:Lx1/c;

    iput-object p2, p0, Lx1/c$h;->a:Lx1/c$k;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p2, p0, Lx1/c$h;->mViewBounds:Lx1/c$k;

    return-void
.end method
