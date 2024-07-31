.class public final synthetic Lre/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lre/c;


# static fields
.field public static final synthetic b:Lre/b;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/b;

    invoke-direct {v0}, Lre/b;-><init>()V

    sput-object v0, Lre/b;->b:Lre/b;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lre/f0;Lre/d0;)Lre/b0;
    .locals 0

    invoke-static {p1, p2}, Lre/c;->b(Lre/f0;Lre/d0;)Lre/b0;

    move-result-object p1

    return-object p1
.end method
