import connexion
import six

from swagger_server.models.inline_response200 import InlineResponse200  # noqa: E501
from swagger_server import util


def users_get(UUID, first_name=None, last_name=None):  # noqa: E501
    """users_get

    Allows users to get employees # noqa: E501

    :param UUID: UUID number of employee
    :type UUID: str
    :param first_name: Users first name
    :type first_name: str
    :param last_name: Users last name
    :type last_name: str

    :rtype: InlineResponse200
    """
    return 'do some magic!'
