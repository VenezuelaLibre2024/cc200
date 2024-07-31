.class public Lh3/i;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lq3/a;

.field public final c:Lq3/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lq3/a;Lq3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/i;->a:Landroid/content/Context;

    iput-object p2, p0, Lh3/i;->b:Lq3/a;

    iput-object p3, p0, Lh3/i;->c:Lq3/a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lh3/h;
    .locals 3

    iget-object v0, p0, Lh3/i;->a:Landroid/content/Context;

    iget-object v1, p0, Lh3/i;->b:Lq3/a;

    iget-object v2, p0, Lh3/i;->c:Lq3/a;

    invoke-static {v0, v1, v2, p1}, Lh3/h;->a(Landroid/content/Context;Lq3/a;Lq3/a;Ljava/lang/String;)Lh3/h;

    move-result-object p1

    return-object p1
.end method
