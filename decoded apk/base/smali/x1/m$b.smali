.class public Lx1/m$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/m;->W(Landroid/animation/Animator;Lu/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lu/a;

.field public final synthetic b:Lx1/m;


# direct methods
.method public constructor <init>(Lx1/m;Lu/a;)V
    .locals 0

    iput-object p1, p0, Lx1/m$b;->b:Lx1/m;

    iput-object p2, p0, Lx1/m$b;->a:Lu/a;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lx1/m$b;->a:Lu/a;

    invoke-virtual {v0, p1}, Lu/g;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lx1/m$b;->b:Lx1/m;

    iget-object v0, v0, Lx1/m;->D:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lx1/m$b;->b:Lx1/m;

    iget-object v0, v0, Lx1/m;->D:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
