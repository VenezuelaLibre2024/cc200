.class public final synthetic Lj4/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj4/v$g;


# static fields
.field public static final synthetic a:Lj4/s;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lj4/s;

    invoke-direct {v0}, Lj4/s;-><init>()V

    sput-object v0, Lj4/s;->a:Lj4/s;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lj4/n;

    invoke-static {p1}, Lj4/v;->a(Lj4/n;)I

    move-result p1

    return p1
.end method
