.class public final synthetic Ln5/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic h:Ln5/b;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ln5/b;

    invoke-direct {v0}, Ln5/b;-><init>()V

    sput-object v0, Ln5/b;->h:Ln5/b;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ls3/m1;

    check-cast p2, Ls3/m1;

    invoke-static {p1, p2}, Ln5/c;->v(Ls3/m1;Ls3/m1;)I

    move-result p1

    return p1
.end method
