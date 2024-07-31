.class public final Lje/m;
.super Lce/k0;
.source ""


# static fields
.field public static final j:Lje/m;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lje/m;

    invoke-direct {v0}, Lje/m;-><init>()V

    sput-object v0, Lje/m;->j:Lje/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lce/k0;-><init>()V

    return-void
.end method


# virtual methods
.method public H0(Ljd/g;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, Lje/c;->p:Lje/c;

    sget-object v0, Lje/l;->h:Lje/i;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lje/f;->L0(Ljava/lang/Runnable;Lje/i;Z)V

    return-void
.end method

.method public J0(I)Lce/k0;
    .locals 1

    invoke-static {p1}, Lhe/t;->a(I)V

    sget v0, Lje/l;->d:I

    if-lt p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-super {p0, p1}, Lce/k0;->J0(I)Lce/k0;

    move-result-object p1

    return-object p1
.end method
