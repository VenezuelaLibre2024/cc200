.class public final synthetic Lh8/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh8/j$a;


# static fields
.field public static final synthetic a:Lh8/c;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lh8/c;

    invoke-direct {v0}, Lh8/c;-><init>()V

    sput-object v0, Lh8/c;->a:Lh8/c;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/util/JsonReader;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lh8/j;->c(Landroid/util/JsonReader;)Lg8/f0$a$a;

    move-result-object p1

    return-object p1
.end method
