.class public final synthetic Lu4/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/t$c;


# instance fields
.field public final synthetic a:Lu4/f;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lu4/f;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/e;->a:Lu4/f;

    iput-object p2, p0, Lu4/e;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lu4/t;Ls3/u3;)V
    .locals 2

    iget-object v0, p0, Lu4/e;->a:Lu4/f;

    iget-object v1, p0, Lu4/e;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1, p2}, Lu4/f;->F(Lu4/f;Ljava/lang/Object;Lu4/t;Ls3/u3;)V

    return-void
.end method
