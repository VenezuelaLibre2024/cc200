.class public final Lx0/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/f$a;,
        Lx0/f$c;,
        Lx0/f$b;
    }
.end annotation


# instance fields
.field public final a:Lx0/f$b;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "textView cannot be null"

    invoke-static {p1, v0}, Lj0/d;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ge v0, v1, :cond_0

    new-instance p1, Lx0/f$b;

    invoke-direct {p1}, Lx0/f$b;-><init>()V

    iput-object p1, p0, Lx0/f;->a:Lx0/f$b;

    goto :goto_1

    :cond_0
    if-nez p2, :cond_1

    new-instance p2, Lx0/f$c;

    invoke-direct {p2, p1}, Lx0/f$c;-><init>(Landroid/widget/TextView;)V

    goto :goto_0

    :cond_1
    new-instance p2, Lx0/f$a;

    invoke-direct {p2, p1}, Lx0/f$a;-><init>(Landroid/widget/TextView;)V

    :goto_0
    iput-object p2, p0, Lx0/f;->a:Lx0/f$b;

    :goto_1
    return-void
.end method


# virtual methods
.method public a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    iget-object v0, p0, Lx0/f;->a:Lx0/f$b;

    invoke-virtual {v0, p1}, Lx0/f$b;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Lx0/f;->a:Lx0/f$b;

    invoke-virtual {v0, p1}, Lx0/f$b;->b(Z)V

    return-void
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Lx0/f;->a:Lx0/f$b;

    invoke-virtual {v0, p1}, Lx0/f$b;->c(Z)V

    return-void
.end method