.class public final synthetic Lz/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lz/h$f;

.field public final synthetic i:Landroid/graphics/Typeface;


# direct methods
.method public synthetic constructor <init>(Lz/h$f;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/j;->h:Lz/h$f;

    iput-object p2, p0, Lz/j;->i:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz/j;->h:Lz/h$f;

    iget-object v1, p0, Lz/j;->i:Landroid/graphics/Typeface;

    invoke-static {v0, v1}, Lz/h$f;->b(Lz/h$f;Landroid/graphics/Typeface;)V

    return-void
.end method
