.class public final synthetic Lm3/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/b$a;


# instance fields
.field public final synthetic a:Lm3/c;

.field public final synthetic b:Lg3/p;

.field public final synthetic c:Lg3/i;


# direct methods
.method public synthetic constructor <init>(Lm3/c;Lg3/p;Lg3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/b;->a:Lm3/c;

    iput-object p2, p0, Lm3/b;->b:Lg3/p;

    iput-object p3, p0, Lm3/b;->c:Lg3/i;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lm3/b;->a:Lm3/c;

    iget-object v1, p0, Lm3/b;->b:Lg3/p;

    iget-object v2, p0, Lm3/b;->c:Lg3/i;

    invoke-static {v0, v1, v2}, Lm3/c;->c(Lm3/c;Lg3/p;Lg3/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
