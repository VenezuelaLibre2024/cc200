.class public final synthetic Lw2/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lw2/j;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Lv2/a;


# direct methods
.method public synthetic constructor <init>(Lw2/j;Landroid/app/Activity;Lv2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/g;->a:Lw2/j;

    iput-object p2, p0, Lw2/g;->b:Landroid/app/Activity;

    iput-object p3, p0, Lw2/g;->c:Lv2/a;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lw2/g;->a:Lw2/j;

    iget-object v1, p0, Lw2/g;->b:Landroid/app/Activity;

    iget-object v2, p0, Lw2/g;->c:Lv2/a;

    invoke-static {v0, v1, v2, p1}, Lw2/j;->h(Lw2/j;Landroid/app/Activity;Lv2/a;Ljava/lang/Exception;)V

    return-void
.end method
