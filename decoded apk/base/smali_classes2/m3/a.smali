.class public final synthetic Lm3/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lm3/c;

.field public final synthetic i:Lg3/p;

.field public final synthetic j:Ld3/j;

.field public final synthetic k:Lg3/i;


# direct methods
.method public synthetic constructor <init>(Lm3/c;Lg3/p;Ld3/j;Lg3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/a;->h:Lm3/c;

    iput-object p2, p0, Lm3/a;->i:Lg3/p;

    iput-object p3, p0, Lm3/a;->j:Ld3/j;

    iput-object p4, p0, Lm3/a;->k:Lg3/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lm3/a;->h:Lm3/c;

    iget-object v1, p0, Lm3/a;->i:Lg3/p;

    iget-object v2, p0, Lm3/a;->j:Ld3/j;

    iget-object v3, p0, Lm3/a;->k:Lg3/i;

    invoke-static {v0, v1, v2, v3}, Lm3/c;->b(Lm3/c;Lg3/p;Ld3/j;Lg3/i;)V

    return-void
.end method
