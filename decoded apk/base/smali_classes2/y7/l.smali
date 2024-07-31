.class public final synthetic Ly7/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly8/b;


# instance fields
.field public final synthetic a:Ly7/n;

.field public final synthetic b:Ly7/c;


# direct methods
.method public synthetic constructor <init>(Ly7/n;Ly7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/l;->a:Ly7/n;

    iput-object p2, p0, Ly7/l;->b:Ly7/c;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ly7/l;->a:Ly7/n;

    iget-object v1, p0, Ly7/l;->b:Ly7/c;

    invoke-static {v0, v1}, Ly7/n;->i(Ly7/n;Ly7/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
