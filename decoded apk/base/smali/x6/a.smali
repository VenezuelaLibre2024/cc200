.class public final Lx6/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lr6/b;


# direct methods
.method public constructor <init>(Lr6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr6/b;

    iput-object p1, p0, Lx6/a;->a:Lr6/b;

    return-void
.end method


# virtual methods
.method public final a()Lr6/b;
    .locals 1

    iget-object v0, p0, Lx6/a;->a:Lr6/b;

    return-object v0
.end method
