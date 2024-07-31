.class public final Lwa/o;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:[I


# instance fields
.field public final a:Lwa/m;

.field public final b:Lwa/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lwa/o;->c:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x1
        0x2
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwa/m;

    invoke-direct {v0}, Lwa/m;-><init>()V

    iput-object v0, p0, Lwa/o;->a:Lwa/m;

    new-instance v0, Lwa/n;

    invoke-direct {v0}, Lwa/n;-><init>()V

    iput-object v0, p0, Lwa/o;->b:Lwa/n;

    return-void
.end method


# virtual methods
.method public a(ILoa/a;I)Lia/n;
    .locals 2

    sget-object v0, Lwa/o;->c:[I

    const/4 v1, 0x0

    invoke-static {p2, p3, v1, v0}, Lwa/p;->n(Loa/a;IZ[I)[I

    move-result-object p3

    :try_start_0
    iget-object v0, p0, Lwa/o;->b:Lwa/n;

    invoke-virtual {v0, p1, p2, p3}, Lwa/n;->b(ILoa/a;[I)Lia/n;

    move-result-object p1
    :try_end_0
    .catch Lia/m; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    iget-object v0, p0, Lwa/o;->a:Lwa/m;

    invoke-virtual {v0, p1, p2, p3}, Lwa/m;->b(ILoa/a;[I)Lia/n;

    move-result-object p1

    return-object p1
.end method
