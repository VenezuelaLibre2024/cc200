.class public final synthetic Lre/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lre/q;


# static fields
.field public static final synthetic b:Lre/p;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/p;

    invoke-direct {v0}, Lre/p;-><init>()V

    sput-object v0, Lre/p;->b:Lre/p;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p1}, Lre/q;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
