.class public final synthetic Ln7/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly8/b;


# instance fields
.field public final synthetic a:Ln7/g;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ln7/g;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/f;->a:Ln7/g;

    iput-object p2, p0, Ln7/f;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ln7/f;->a:Ln7/g;

    iget-object v1, p0, Ln7/f;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Ln7/g;->b(Ln7/g;Landroid/content/Context;)Le9/a;

    move-result-object v0

    return-object v0
.end method
