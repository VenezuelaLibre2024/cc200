.class public La0/e$a;
.super Lh0/g$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lz/h$f;


# direct methods
.method public constructor <init>(Lz/h$f;)V
    .locals 0

    invoke-direct {p0}, Lh0/g$c;-><init>()V

    iput-object p1, p0, La0/e$a;->a:Lz/h$f;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, La0/e$a;->a:Lz/h$f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lz/h$f;->h(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, La0/e$a;->a:Lz/h$f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lz/h$f;->i(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
