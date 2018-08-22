# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.inline_response200 import InlineResponse200  # noqa: E501
from swagger_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_users_get(self):
        """Test case for users_get

        
        """
        query_string = [('UUID', 'UUID_example'),
                        ('first_name', 'first_name_example'),
                        ('last_name', 'last_name_example')]
        response = self.client.open(
            '/users',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
