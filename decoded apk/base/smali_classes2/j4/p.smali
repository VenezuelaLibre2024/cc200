.class public final synthetic Lj4/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lj4/q;


# static fields
.field public static final synthetic b:Lj4/p;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lj4/p;

    invoke-direct {v0}, Lj4/p;-><init>()V

    sput-object v0, Lj4/p;->b:Lj4/p;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 0

    invoke-static {p1, p2, p3}, Lj4/v;->s(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
