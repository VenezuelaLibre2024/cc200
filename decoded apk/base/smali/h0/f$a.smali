.class public Lh0/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh0/f;->e(Landroid/content/Context;Lh0/e;Lh0/a;II)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lh0/f$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lh0/e;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Lh0/e;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lh0/f$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lh0/f$a;->b:Landroid/content/Context;

    iput-object p3, p0, Lh0/f$a;->c:Lh0/e;

    iput p4, p0, Lh0/f$a;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lh0/f$e;
    .locals 4

    iget-object v0, p0, Lh0/f$a;->a:Ljava/lang/String;

    iget-object v1, p0, Lh0/f$a;->b:Landroid/content/Context;

    iget-object v2, p0, Lh0/f$a;->c:Lh0/e;

    iget v3, p0, Lh0/f$a;->d:I

    invoke-static {v0, v1, v2, v3}, Lh0/f;->c(Ljava/lang/String;Landroid/content/Context;Lh0/e;I)Lh0/f$e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lh0/f$a;->a()Lh0/f$e;

    move-result-object v0

    return-object v0
.end method